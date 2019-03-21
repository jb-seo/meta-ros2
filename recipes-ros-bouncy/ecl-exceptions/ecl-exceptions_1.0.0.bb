# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Template based exceptions - these are simple and practical      and avoid the proliferation of exception types. Although not      syntatactically ideal, it is convenient and eminently practical."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-config ecl-errors ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_exceptions/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e7db6029d34483d62fac553280f96816"
SRC_URI[sha256sum] = "82a269538d72b568caf87588c67a32d724d38ee844b5f051b116b3fb558093be"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_exceptions-1.0.0-0"

inherit ros
inherit ament


