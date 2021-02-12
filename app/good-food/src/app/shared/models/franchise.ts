export interface IFranchise {
    id?: number;
    designation?: string;
    tel?:string;
    mail?: string;
    adresse?: string;
    img?: string;
}

export class Franchise implements IFranchise{
    id?: number;
    designation?: string;
    tel?: string;
    mail?: string;
    adresse?: string;
    img?: string;
    constructor(opt?: Partial<IFranchise>) {
        Object.assign(this, opt);
    }
}
