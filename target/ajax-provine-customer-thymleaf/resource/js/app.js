
class App {
    static BASE_URL_CUSTOMER = "http://localhost:8080/api/customers";
    static BASE_URL_PROVINCE = "http://localhost:8080/api/provinces";
    // static RESOURCE_API = "https://provinces.open-api.vn/api/"
    static RESOURCE_API = "https://vapi.vnappmob.com/api/province";

    static showDeleteConfirmDialog() {
        return Swal.fire({
            icon: 'warning',
            text: 'Are you sure you want to delete the selected data ?',
            showCancelButton: true,
            confirmButtonColor: '#3085d6',
            cancelButtonColor: '#d33',
            confirmButtonText: 'Yes, delete it !',
            cancelButtonText: 'Cancel',
        })
    }

    static showSuccessAlert(t) {
        Swal.fire({
            icon: 'success',
            title: t,
            position: 'top-end',
            showConfirmButton: false,
            timer: 1500
        })
    }

    static showErrorAlert(t) {
        Swal.fire({
            icon: 'error',
            title: 'Warning',
            text: t,
        })
    }
}

class Customer {
    constructor(id, fullName, email, phone, province_id) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.province_id = province_id;
    }
}
