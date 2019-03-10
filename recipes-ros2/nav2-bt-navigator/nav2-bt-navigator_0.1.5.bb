# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "TODO"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake behaviortree-cpp nav2-msgs nav2-tasks nav-msgs rclcpp std-msgs"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_bt_navigator/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "08fc2d63a6e961bb8c46f6991c261835"
SRC_URI[sha256sum] = "2d3a3b429280519265909da59465281ebf97ceb374c9968fd787f7985d6c4f5d"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_bt_navigator-0.1.5-0"

inherit catkin
