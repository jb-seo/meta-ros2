# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The launch command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " launch launch-ros ros2cli ros2pkg"
SRC_URI = "https://github.com/ros2-gbp/launch-release/archive/release/crystal/${PN}/0.7.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "90ebf95a925bbf201bdb56f37bc5bb54"
SRC_URI[sha256sum] = "0819c2c8cdb11c78713b0150c1eab739cfa08ad41a8605d6e31d5c3070141ff2"
S = "${WORKDIR}/launch-release-release-crystal-${PN}-0.7.3-0"

inherit ros-bpn setuptools3
