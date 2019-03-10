# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "TODO"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake nav2-msgs nav2-tasks rclcpp"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_simple_navigator/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "40ab6ffb2bd8f2084553d7322b9e7300"
SRC_URI[sha256sum] = "81b7e86b346b2ddc9c86c4d94a2d3416331a64b2d3ba6802525bc457dab0bd92"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_simple_navigator-0.1.5-0"

inherit catkin
