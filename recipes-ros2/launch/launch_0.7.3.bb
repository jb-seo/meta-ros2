# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ROS launch tool."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "osrf-pycommon"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/crystal/${PN}/0.7.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b77b3d791b3cb614a6eabcd4b1a5a223"
SRC_URI[sha256sum] = "85ac5be9406fac7aefe6445d6b9e0227ad52840b8f8ded9671aa9925d3a4f829"
S = "${WORKDIR}/${PN}-release-release-crystal-${PN}-0.7.3-0"

inherit ros-bpn setuptools3
