# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CMake shim over the tinxml library."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "cmake libtinyxml"
SRC_URI = "https://github.com/ros2-gbp/tinyxml_vendor-release/archive/release/crystal/tinyxml_vendor/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "942018b7d34e3179842b23007f98fddc"
SRC_URI[sha256sum] = "ad189cbcce4e0a7187d9dc7bc1fea531fb2cfa4e68ffb506556ddfcd65d79c08"
S = "${WORKDIR}/tinyxml_vendor-release-release-crystal-tinyxml_vendor-0.5.0-0"

inherit ament
