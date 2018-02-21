package com.illuxplain.services.user;

import com.illuxplain.dtos.user.UserGetDTO;
import com.illuxplain.models.user.User;

public interface IUserServices {
    UserGetDTO getUserByEmail(String email);
    User getFullUserObjectByEmail(String email);
}
