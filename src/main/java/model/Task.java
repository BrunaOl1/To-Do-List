package model;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
    private Long id;
    private String title;
    private String description;
    private LocalDate creationDate = LocalDate.now();
    private LocalDate dueDate;

        public Task(){

        }

        public Task(long id, String title, String description, LocalDate creationDate, LocalDate dueDate) {
            this.id = id;
            this.title = title;
            this.description = description;
            this.creationDate = LocalDate.now();
            this.dueDate = dueDate;
        }

        public Long getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            title = title;
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
           description = description;
        }
        public LocalDate getCreationDate() {
            return creationDate;
        }
        public void setCreationDate(LocalDate creationDate) {
            this.creationDate = creationDate;
        }
        public LocalDate getDueDate() {
            return dueDate;
        }
        public void setDueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Task model = (Task) o;
            return Objects.equals(id, model.id) && Objects.equals(title, model.title) && Objects.equals(description, model.description) && Objects.equals(creationDate, model.creationDate) && Objects.equals(dueDate, model.dueDate);
        }
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
        }
    }



