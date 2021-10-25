import org.mindrot.jbcrypt.BCrypt;

public class HashTest {
    public static void main(String[] args) {
//        String salt = BCrypt.gensalt();
//        System.out.println(salt);

        String password = "vSkronkPW";
//        String hash = BCrypt.hashpw(password,BCrypt.gensalt());
//        System.out.println(hash);
        String hashedPassword = "$2a$10$GcdbAP/eNjfplx9FfkxAKuaoamjH4CCrAKVIM48XN7nagXeDa8jZK";
        boolean passwordsMatch = BCrypt.checkpw(password, hashedPassword);
        System.out.println(passwordsMatch);
    }
}
