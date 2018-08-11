# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Demo of turtlebot2 localization with amcl."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "amcl ament-cmake ament-index-python astra-camera depthimage-to-laserscan joy launch map-server ros2run teleop-twist-joy tf2-ros turtlebot2-drivers"
SRC_URI = "https://github.com/ros2-gbp/turtlebot2_demo-release/archive/release/bouncy/turtlebot2_amcl/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "973b5ad97fb2f45d1a76fc89586cdb01"
SRC_URI[sha256sum] = "1839b6c737ebb6682ff17bcdef6dcc918ee3f023432e9e5986cb03e8dc67f162"
S = "${WORKDIR}/turtlebot2_demo-release-release-bouncy-turtlebot2_amcl-0.5.1-0"

inherit catkin
