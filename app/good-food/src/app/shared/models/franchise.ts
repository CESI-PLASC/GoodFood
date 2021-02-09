export interface IFranchise {
    id?: number;
    name?: string;
}

export class Franchise implements IFranchise{
    id?: number;
    name?: string;
    constructor(opt?: Partial<IFranchise>) {
        Object.assign(this, opt);
    }
}
