package model;

public class Libro {
		private String autore;
		private String titolo;
		private int numPagine;
		private String collocazione; //coordinate di posizione
		private boolean disponibile;
		
		
		
		public Libro(String autore, String titolo) {
			this.autore = autore;
			this.titolo = titolo;
			setCollocazione(titolo);
			this.disponibile = true;
		}



		public Libro(String autore, String titolo, int numPagine) {
			this(autore, titolo); //chiamo riga 14
			this.numPagine = numPagine;
			
		}



		public String getAutore() {
			return autore;
		}



		public void setAutore(String autore) {
			this.autore = autore;
		}



		public String getTitolo() {
			return titolo;
		}



		public void setTitolo(String titolo) {
			this.titolo = titolo;
		}



		public int getNumPagine() {
			return numPagine;
		}



		public void setNumPagine(int numPagine) {
			this.numPagine = numPagine;
		}



		public String getCollocazione() {
			return collocazione;
		}



		public void setCollocazione(String collocazione) {
			this.collocazione = this.autore.substring(0, 2)+this.titolo.substring(0, 3)+this.titolo.length();  
		}



		public boolean isDisponibile() {
			return disponibile;
		}



		public void setDisponibile(boolean disponibile) {
			this.disponibile = disponibile;
		}



		@Override
		public String toString() {
			return "Libro [autore=" + autore + ", titolo=" + titolo + ", numPagine=" + numPagine + ", collocazione="
					+ collocazione + ", disponibile=" + disponibile + "]";
		}
		
		
		
}
