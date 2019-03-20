# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The msg command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ros2cli"
SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/bouncy/${PN}/0.5.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "411fb96a121f232050338363f1758ff7"
SRC_URI[sha256sum] = "fcc2c9e21f881a2f4dee872ed5363d79a0ffe248731d2866e3db9557cef0047e"
S = "${WORKDIR}/ros2cli-release-release-bouncy-${PN}-0.5.4-0"


inherit ros
inherit setuptools3

