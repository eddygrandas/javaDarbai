package lt.codeAcademy.blogas.boot;

import lt.codeAcademy.blogas.repository.MenuRepository;
import lt.codeAcademy.blogas.model.MenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private MenuRepository menuRepository;

    @Autowired
    public void setMenuRepository(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        MenuItem menuItem = new MenuItem();
        menuItem.setName("Pirmas įrašas");
        menuItem.setDescription("Kažką bandau daryt");
        menuRepository.save(menuItem);

        MenuItem menuItem1 = new MenuItem();
        menuItem1.setName("Antras įrašas");
        menuItem1.setDescription("Jau lyg ir pradėjo gautis");
        menuRepository.save(menuItem1);

        MenuItem menuItem3 = new MenuItem();
        menuItem3.setName("Trečias įrašas");
        menuItem3.setDescription("Kažkas negerai");
        menuRepository.save(menuItem3);

        MenuItem menuItem4 = new MenuItem();
        menuItem4.setName("Ketvirtas įrašas");
        menuItem4.setDescription("...kaip visad");
        menuRepository.save(menuItem4);

        MenuItem menuItem5 = new MenuItem();
        menuItem5.setName("Penktas įrašas");
        menuItem5.setDescription("pradėjo griūt");
        menuRepository.save(menuItem5);
    }
}
