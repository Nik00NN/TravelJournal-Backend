package travel.journal.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "\"travel_journal\"")

public class TravelJournal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "travel_id")
    private int travelId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    @Column(name = "budget")
    private double budget;

    @Column(name = "description" , columnDefinition = "TEXT")
    private String description;

    @Column(name = "has_cover_photo")
    private Boolean hasCoverPhoto;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "file_id", nullable = false)
    private File coverPhoto;

    @OneToMany(mappedBy = "travelJournal",cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("noteList")
    private List<Note> noteList;

    public TravelJournal(int travelId, User user, String location, LocalDate startDate, LocalDate endDate, double budget, String description, Boolean hasCoverPhoto, File coverPhoto, List<Note> noteList) {
        this.travelId = travelId;
        this.user = user;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.budget = budget;
        this.description = description;
        this.hasCoverPhoto = hasCoverPhoto;
        this.coverPhoto = coverPhoto;
        this.noteList = noteList;
    }

    public TravelJournal() {
    }

    public int getTravelId() {
        return travelId;
    }

    public void setTravelId(int travelId) {
        this.travelId = travelId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getHasCoverPhoto() {
        return hasCoverPhoto;
    }

    public void setHasCoverPhoto(Boolean hasCoverPhoto) {
        this.hasCoverPhoto = hasCoverPhoto;
    }

    public File getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(File coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNotesList(List<Note> noteList) {
        this.noteList = noteList;
    }

}