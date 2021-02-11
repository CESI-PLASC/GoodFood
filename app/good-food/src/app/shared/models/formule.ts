export interface IFormule {
    id?: number;
    designation?: string;
}

export class Formule implements IFormule {
    id?: number;
    designation?: string;
    constructor(opt?: Partial<IFormule>) {
        Object.assign(this, opt);
    }
}
