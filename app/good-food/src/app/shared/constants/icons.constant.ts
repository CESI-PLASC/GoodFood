import {
    faCheckSquare, faChevronDown, faChevronRight, faMinus, faPlus, faSearch, faSyncAlt, faTimes
} from '@fortawesome/free-solid-svg-icons';
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
    franchise: {
        loupe: faSearch
    },
    validation: {
        add: faPlus,
        cancel: faTimes,
        change: faSyncAlt
    }
};
