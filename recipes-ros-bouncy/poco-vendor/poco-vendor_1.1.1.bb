# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CMake shim over the poco library."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0 & Boost-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=401a7342a877608092ef332b6948eb03"

DEPENDS = "cmake poco pcre zlib"
SRC_URI = "https://github.com/ros2-gbp/poco_vendor-release/archive/release/bouncy/poco_vendor/1.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9bfd9524341e48ab4e97f5f83d76b778"
SRC_URI[sha256sum] = "cda587f77c5cc377deac90d5b13d8b6e1f61b7781f51ac86a76bf997ccd35add"
S = "${WORKDIR}/poco_vendor-release-release-bouncy-poco_vendor-1.1.1-0"


inherit ros
inherit cmake

