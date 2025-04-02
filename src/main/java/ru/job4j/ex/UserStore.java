package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                result = user;
                break;
            }
        }
        if (result == null) {
            throw new UserNotFoundException("User with this name is not found");
        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername() == null || user.getUsername().length() < 3) {
            throw new UserInvalidException("Username is not correct");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ea) {
            throw new RuntimeException("Пользователь не валидный");
        } catch (UserNotFoundException e) {
            throw new RuntimeException("Пользователь не найден");
        }
    }
}