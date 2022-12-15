package com.example.listviewapp.model;

public class Article {
        private Integer code;
        public String libelle;
        public Double pv;

        public Article(Integer code, String libelle, Double pv) {
                this.code = code;
                this.libelle = libelle;
                this.pv = pv;
        }

        public Integer getCode() {
                return code;
        }

        public void setCode(Integer code) {
                this.code = code;
        }

        public String getLibelle() {
                return libelle;
        }

        public void setLibelle(String libelle) {
                this.libelle = libelle;
        }

        public Double getPv() {
                return pv;
        }

        public void setPv(Double pv) {
                this.pv = pv;
        }

        @Override
        public String toString() {
                return "Article{" +
                        "code=" + code +
                        ", libelle='" + libelle + '\'' +
                        ", pv=" + pv +
                        '}';
        }
}
