package cinema.config;

import cinema.model.Role;
import cinema.model.RoleName;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setName(RoleName.ADMIN);
        roleService.add(adminRole);

        Role userRole = new Role();
        userRole.setName(RoleName.USER);
        roleService.add(userRole);

        User admin = new User();
        admin.setEmail("bob@i.ua");
        admin.setPassword("11111");
        admin.setRoles(Set.of(adminRole));
        userService.add(admin);

        User user = new User();
        user.setEmail("alice@i.ua");
        user.setPassword("22222");
        user.setRoles(Set.of(userRole));
        userService.add(user);
    }
}
