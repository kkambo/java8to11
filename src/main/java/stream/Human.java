package stream;

import java.time.LocalDate;

public class Human {
    private static Long serialNUM = 0L;
    private Long idx;
    private String name;
    private Integer money;
    private String birth;

    public Human(String name, Integer money, String birth) {
        this.idx = ++serialNUM;
        this.name = name;
        this.money = money;
        this.birth = birth;
    }

    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Human{" +
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", birth=" + birth +
                '}';
    }
}
