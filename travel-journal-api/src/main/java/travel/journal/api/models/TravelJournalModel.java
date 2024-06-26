package travel.journal.api.models;

import lombok.Data;
import travel.journal.api.dto.travelJournal.outbound.NoteDetailsDTO;

import java.time.LocalDate;
import java.util.List;

@Data
public class TravelJournalModel {

    private int travelId;
    private UserModel user;
    private String location;
    private LocalDate startDate;
    private LocalDate endDate;
    private double budget;
    private String description;
    private Boolean hasCoverPhoto;
    private FileModel coverPhoto;
    private List<NoteDetailsDTO> notesList;
 }
