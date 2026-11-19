class TrackViewsMixin:
    def track_view(self):
        if not hasattr(self, "views"):
            self.views = 0
        self.views += 1
        return self.views


class DiscountMixin:
    def apply_discount(self, percent):
        return self.price - (self.price * percent / 100)


class Product:
    def __init__(self, name, price):
        self.name = name
        self.price = price


class DigitalProduct(Product, TrackViewsMixin, DiscountMixin):
    def __init__(self, name, price, file_size_mb):
        super().__init__(name, price)
        self.file_size_mb = file_size_mb


ebook = DigitalProduct("Python eBook", 20.0, 5)


ebook.track_view()
ebook.track_view()
print(f"{ebook.name} views: {ebook.track_view()}")


print(f"{ebook.name} price after 25% discount: ${ebook.apply_discount(25)}")


print("isinstance of Product:", isinstance(ebook, Product))
print("MRO:", [c.__name__ for c in DigitalProduct.__mro__])
