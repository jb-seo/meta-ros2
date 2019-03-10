# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "<p>       amcl is a probabilistic localization system for a robot moving in       2D. It implements the adaptive (or KLD-sampling) Monte Carlo       localization approach (as described by Dieter Fox), which uses a       particle filter to track the pose of a robot against a known map.     </p>     <p>       This node is derived, with thanks, from Andrew Howard's excellent       'amcl' Player driver.     </p>"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "ament-cmake geometry-msgs launch-ros launch-testing message-filters nav2-dynamic-params nav2-tasks nav2-util nav-msgs rclcpp sensor-msgs std-srvs tf2 tf2-geometry-msgs tf2-ros"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_amcl/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5ff8249665cf46c46b090a08af096a58"
SRC_URI[sha256sum] = "ae53cf800566ef3ba6ca578d2643bde900f544f572214ea53caa47cdd9cc2fc1"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_amcl-0.1.5-0"

inherit catkin
