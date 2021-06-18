export class User {
    public id: number;
    public nom: string;
    public prenom: string;
    public email: string;
    public franchiseId: number;

    constructor(opt?: Partial<User>) {
        Object.assign(this, opt);
    }
}
