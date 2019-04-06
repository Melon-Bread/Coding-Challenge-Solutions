class SpaceAge(object):
    def __init__(self, seconds):
        self.earth_years = seconds / 60 / 60 / 24 / 365.25
        pass

    def on_mercury(self):
        return float("{0:.2f}".format(self.earth_years / 0.2408467, 2))

    def on_venus(self):
        return float("{0:.2f}".format(self.earth_years / 0.61519726, 2))
    
    def on_earth(self):
        return float("{0:.2f}".format(self.earth_years, 2))

    def on_mars(self):
        return float("{0:.2f}".format(self.earth_years / 1.8808158, 2))

    def on_jupiter(self):
        return float("{0:.2f}".format(self.earth_years / 11.862615, 2))

    def on_saturn(self):
        return float("{0:.2f}".format(self.earth_years / 29.44749, 2))

    def on_uranus(self):
        return float("{0:.2f}".format(self.earth_years / 84.016846, 2))

    def on_neptune(self):
        return float("{0:.2f}".format(self.earth_years / 164.79132, 2))
