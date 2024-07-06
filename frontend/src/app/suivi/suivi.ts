import {EtatEnum} from "../enums/etat-enum";

export interface Suivi {
  id?: string;
  postuler?: EtatEnum;
  datePostulation?: Date
  relancer?: EtatEnum;
  dateRelance?: Date;
  dateEntretien?: Date;
  reponse?: EtatEnum;
  dateReponse?: Date;
  offreId?: string;
}
