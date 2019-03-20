# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The formatters here simply format various input types to a specified    text format. They can be used with most streaming types (including both    ecl and stl streams)."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-config ecl-converters ecl-exceptions ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_formatters/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "84d321c3bb2d5abf0fb53405be7ca7c0"
SRC_URI[sha256sum] = "24234da53aff8879a96f1abbfa9713c8dcc1d99f1efe99519c67204fc7a230ce"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_formatters-1.0.0-0"


inherit ros
inherit ament

