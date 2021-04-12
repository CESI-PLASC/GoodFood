export interface IFormule {
    id?: number;
    designation?: string;
    prix?: number;
}

export class Formule implements IFormule {
    id?: number;
    designation?: string;
    prix?: number;
    constructor(opt?: Partial<IFormule>) {
        Object.assign(this, opt);
    }
}
