# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Most implementations (windows, posix, ...) have slightly different api for      low level input-output functions. These are gathered here and re-represented      with a cross platform set of functions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-config ecl-errors ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/bouncy/ecl_io/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "090eabd1a69dbb9031ee9d06d3fafa5b"
SRC_URI[sha256sum] = "47f5b195440e8fcd60c3a2675fd305520e38d4c10c922387da1d23e3def7d884"
S = "${WORKDIR}/ecl_lite-release-release-bouncy-ecl_io-1.0.0-0"


inherit ros
inherit ament

