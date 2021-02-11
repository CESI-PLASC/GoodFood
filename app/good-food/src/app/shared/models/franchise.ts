export interface IFranchise {
    id?: number;
    name?: string;
    tel?:string;
    mail?: string;
    adresse?: string;
    img?: string;
}

export class Franchise implements IFranchise{
    id?: number;
    name?: string;
    tel?: string;
    mail?: string;
    adresse?: string;
    img?: string;
    constructor(opt?: Partial<IFranchise>) {
        Object.assign(this, opt);
    }
}
