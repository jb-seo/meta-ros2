# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pkg command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ros2cli python3-catkin-pkg-native python3-empy-native python3-pkg-resources"
SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/bouncy/${PN}/0.5.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "02315a1493e40099971ad95203bd041d"
SRC_URI[sha256sum] = "f2e71ee3c4f3a28c1d7e1a010e9500ee601b56ee404bfe67b659b43c09526b72"
S = "${WORKDIR}/ros2cli-release-release-bouncy-${PN}-0.5.4-0"


inherit ros
inherit setuptools3

