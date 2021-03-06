SUMMARY = "Python implementation of a sliding window memory map manager"
DESCRIPTION = "A pure Python implementation of a sliding memory map to \
help unifying memory mapped access on 32 and 64 bit systems and to help \
managing resources more efficiently."
HOMEPAGE = "http://github.com/gitpython-developers/GitPython"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI = "http://pypi.python.org/packages/source/s/smmap/smmap-${PV}.tar.gz"
SRC_URI[md5sum] = "d7932d5ace206bf4ae15198cf36fb6ab"
SRC_URI[sha256sum] = "0e2b62b497bd5f0afebc002eda4d90df9d209c30ef257e8673c90a6b5c119d62"

UPSTREAM_CHECK_URI = "https://pypi.python.org/pypi/smmap/"
UPSTREAM_CHECK_REGEX = "/smmap/(?P<pver>(\d+[\.\-_]*)+)"

S = "${WORKDIR}/smmap-${PV}"

inherit setuptools

RDEPENDS_${PN} += "python-codecs python-mmap python-lang"

BBCLASSEXTEND = "nativesdk"
