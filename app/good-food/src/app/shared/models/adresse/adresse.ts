
export interface IAdresse {
  id?: number;
  pays?: string;
  codePostal?: string;
  rue?: string;
  ville?: string;
  complement?: string | null;
}

export class Adresse implements IAdresse {
  id?: number;
  pays?: string;
  codePostal?: string;
  rue?: string;
  ville?: string;
  complement?: string | null;
  constructor(opt?: Partial<IAdresse>) {
    Object.assign(this, opt);
  }

  toString(): string{
    return `${this.rue}, ${this.codePostal} ${this.ville} - ${this.pays}`;
  }
}
