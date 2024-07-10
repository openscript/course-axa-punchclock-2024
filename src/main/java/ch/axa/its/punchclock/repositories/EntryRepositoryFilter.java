package ch.axa.its.punchclock.repositories;

import java.util.List;

import ch.axa.its.punchclock.domain.Entry;

public interface EntryRepositoryFilter {
    List<Entry> filter(String categoryId, String tagId, String descriptionSearch);
}
