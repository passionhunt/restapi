package com.passionhunt.ai.restapi.resources.model;

/**
 * Created by i316579 on 31/07/18.
 */
public class User {

    private String username;
    private Long salary;


    public User(String username, Long salary) {
        this.username = username;
        this.salary = salary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getUsername() != null ? !getUsername().equals(user.getUsername()) : user.getUsername() != null)
            return false;
        return salary != null ? salary.equals(user.salary) : user.salary == null;
    }

    @Override
    public int hashCode() {
        int result = getUsername() != null ? getUsername().hashCode() : 0;
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        return result;
    }


}
