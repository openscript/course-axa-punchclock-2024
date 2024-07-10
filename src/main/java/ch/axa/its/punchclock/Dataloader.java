package ch.axa.its.punchclock;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import ch.axa.its.punchclock.domain.Category;
import ch.axa.its.punchclock.domain.Entry;
import ch.axa.its.punchclock.domain.Tag;
import ch.axa.its.punchclock.repositories.CategoryRepository;
import ch.axa.its.punchclock.repositories.EntryRepository;
import ch.axa.its.punchclock.repositories.TagRepository;

@Component
public class Dataloader implements ApplicationRunner {

  @Autowired
  private CategoryRepository categoryRepository;

  @Autowired
  private TagRepository tagRepository;

  @Autowired
  private EntryRepository entryRepository;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    var category = new Category();
    category.setName("Arbeit");
    categoryRepository.save(category);

    var tag = new Tag();
    tag.setName("Projekt: Punchclock");
    tagRepository.save(tag);

    var entry = new Entry();
    var tags = new HashSet<Tag>();
    tags.add(tag);
    entry.setTags(tags);
    entry.setCategory(category);
    entry.setCheckIn(LocalDateTime.now().minusHours(2).truncatedTo(ChronoUnit.MINUTES));
    entry.setCheckOut(LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES));
    entryRepository.save(entry);
  }
}
