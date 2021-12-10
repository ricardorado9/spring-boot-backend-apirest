package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IUsuarioDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Usuario;

@Service
public class UsuarioService implements UserDetailsService {

	@Autowired
	private IUsuarioDao usuarioDao;

	private Logger logger = LoggerFactory.getLogger(UsuarioService.class);

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioDao.findByUsername(username);
		if (usuario == null) {
			String msg = "Error en el login: No existe el usuario " + username + " en el sistema!";
			logger.error(msg);
			throw new UsernameNotFoundException(msg);
		}

		List<GrantedAuthority> authorities = usuario.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getNombre()))
				.peek(authority -> logger.info("Role : " + authority.getAuthority())).collect(Collectors.toList());
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.getEnabled(), true, true, true,
				authorities);
	}

}
