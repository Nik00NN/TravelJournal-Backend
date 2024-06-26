
package travel.journal.api.service;

import org.springframework.web.multipart.MultipartFile;
import travel.journal.api.dto.travelJournal.inbound.TravelJournalDTO;
import travel.journal.api.dto.travelJournal.outbound.CardTravelJournalDTO;
import travel.journal.api.dto.travelJournal.outbound.TravelJournalDetailsDTO;
import travel.journal.api.entities.TravelJournal;

import java.io.IOException;
import java.util.List;

public interface TravelService {


    TravelJournalDetailsDTO createTravelJournal(TravelJournalDTO travelJournal, MultipartFile file) throws IOException;

    TravelJournalDetailsDTO getTravelJournal(Integer id);

    TravelJournalDetailsDTO getTravelJournal(Integer id, Integer userId);

    List<TravelJournalDetailsDTO> getAllTravelJournals();

    TravelJournalDetailsDTO modifyTravelJournal(Integer id, TravelJournalDTO travelJournal, MultipartFile file) throws IOException;

    void deleteTravelJournal(Integer id);

    TravelJournal getTravelJournalById(int id);

    List<CardTravelJournalDTO> getUserTravelJournals();

    TravelJournal findByUserUserIdAndTravelId(int userId, int travelId);
}

