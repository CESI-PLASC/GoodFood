import { faCheckSquare, faChevronDown, faChevronRight, faEye, faMinus, faPlus, faTimes } from '@fortawesome/free-solid-svg-icons';
import { faSquare } from '@fortawesome/free-regular-svg-icons';

export const Icons = {
    produits: {
        add: faPlus,
        remove: faMinus
    },
    selectBox: {
        checked: faCheckSquare,
        unchecked: faSquare
    },
    catalogue: {
        collapsed: faChevronRight,
        uncollapsed: faChevronDown
    },
    formule: {
        delete: faTimes,
        infos: faEye
    }
};
