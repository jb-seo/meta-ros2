# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing the Python client."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "python-cmake-module rcl rcutils rmw-implementation rmw-implementation-cmake"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/0.5.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fc0f7b3f142f60df9e7067c384fc2bfa"
SRC_URI[sha256sum] = "7490e1537fb30ba4fc0a0b0b506de11bea02556a0bb9567fd5fb5f2c1dc2f16f"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-0.5.4-0"


inherit ros
inherit ament

