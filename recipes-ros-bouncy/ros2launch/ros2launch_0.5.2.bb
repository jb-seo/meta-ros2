# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The launch command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-index-python launch launch-ros ros2cli ros2pkg"
SRC_URI = "https://github.com/ros2-gbp/launch-release/archive/release/bouncy/${PN}/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "19968e07249540447038aca2a6518d58"
SRC_URI[sha256sum] = "87a91f127cc2e1c1e2664877b79e3b69b4f25a0d8e90936391bd21e5a3e66435"
S = "${WORKDIR}/launch-release-release-bouncy-${PN}-0.5.2-0"

inherit catkin
