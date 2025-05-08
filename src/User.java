public class User {
    String nameOfUser;
    double Budget;

    public User(String nameOfUser, double Budget) {
        this.nameOfUser = nameOfUser;
        this.Budget = Budget;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public void setNameOfUser(String nameOfUser) {
        this.nameOfUser = nameOfUser;
    }

    public double getBudget() {
        return Budget;
    }

    public void setBudget(double budget) {
        Budget = budget;
    }
}
