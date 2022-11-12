package com.client.ws.ramoo.Service;

import com.client.ws.ramoo.Models.Users;
import com.client.ws.ramoo.dto.UserDTO;

public interface UserService {

	Users create(UserDTO dto);
}
