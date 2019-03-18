# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "TODO"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " geometry-msgs nav2-msgs nav2-robot nav2-tasks nav2-util nav-msgs rclcpp tf2 tf2-geometry-msgs"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_motion_primitives/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eddcf753c39748782985330d0ccaeeec"
SRC_URI[sha256sum] = "9a002cb369b5d7c4aa80a828cc6753c2ecc3f4a235d0ccf98ebb4d9abb202468"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_motion_primitives-0.1.5-0"

inherit ament
