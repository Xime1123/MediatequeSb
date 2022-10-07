package com.plb.projectSb.entity;


	
	import java.util.Objects;

	import javax.persistence.*;
	import javax.validation.constraints.NotNull;

	import lombok.Data;

	@Data
	@Entity
	@Table (name= "cd")
	public class Cd  extends Item{
		

		private static final long serialVersionUID = 1L;
		
		
		@NotNull
		private String artist;
		
		@NotNull
		private int duration;
	    
		@NotNull
		@Column(name= "Numbertitles")
		private int titlesNumber;

		@Override
		public int hashCode() {
			return Objects.hash(artist, duration, titlesNumber);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cd other = (Cd) obj;
			return Objects.equals(artist, other.artist) && duration == other.duration && titlesNumber == other.titlesNumber;
		}
		

}
