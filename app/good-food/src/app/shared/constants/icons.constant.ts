import {
    faCheckSquare, faChevronDown, faChevronRight, faEye, faMinus, faPlus, faSearch, faSquare, faSyncAlt, faTimes
} from '@fortawesome/free-solid-svg-icons';

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
