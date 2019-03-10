# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "TODO"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake geometry-msgs launch-ros launch-testing nav2-amcl nav2-msgs nav2-tasks nav2-util nav-msgs rclcpp rclpy std-msgs visualization-msgs"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_system_tests/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d810464468a1a22793b28947226750d7"
SRC_URI[sha256sum] = "bc91c983658def3a441c2ae44fe013f740fbfc4a097f4c72e12f0949d0a862c5"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_system_tests-0.1.5-0"

inherit catkin
