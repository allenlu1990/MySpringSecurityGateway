package org.example.api.component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import java.util.List;

/**
 * 登录用户信息
 * Created by macro on 2020/6/19.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@Entity
public class UserDto {

    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name", unique = true, nullable = false, length = 64)
    private String username;
    @Column(name = "pass_word", nullable = false, length = 64)
    private String password;

    @Column(name = "user_status", length = 32)
    private Integer status;
    @Column(name = "client_id", length = 64)
    private String clientId;
    @Column(name = "roles_string", length = 64)
    private String rolesString;

    @Transient
    private List<String> roles;

}
