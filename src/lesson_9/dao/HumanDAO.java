package lesson_9.dao;

public class HumanDAO implements DAO {

    Human[] people = new Human[5];

    @Override
    public Human create(Human human) {
        Human humanThatWeAreLookInFor = null;
        for (int i = 0; i < people.length; i++) {
            if (people[i] == null){
                people[i] = human;
                humanThatWeAreLookInFor = people[i];
                break;
            }
        }

        return humanThatWeAreLookInFor;
    }

    @Override
    public Human read(String name) {
        Human human = null;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getName().equals(name)){
                System.out.println(people[i].getName() + " " + people[i].getEmail());
                human = people[i];
                break;
            }
        }
        return human;
    }

    @Override
    public Human update(Human human) {
        for (Human h:people) {
            if (h.equals(human)){
                h.setName(human.getName());
                h.setEmail(human.getEmail());
                break;
            }
        }
        return human;
    }

    @Override
    public void delete(Human human) {
        for (Human h:people) {
            if (h.equals(human)){
                h.setName(human.getName());
                h.setEmail(human.getEmail());
                break;
            }
        }

    }
}
