# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "image_transport should always be used to subscribe to and publish images. It provides transparent      support for transporting images in low-bandwidth compressed formats. Examples (provided by separate      plugin packages) include JPEG/PNG compression and Theora streaming video."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros message-filters pluginlib rclcpp sensor-msgs"
SRC_URI = "https://github.com/ros2-gbp/image_common-release/archive/release/crystal/image_transport/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e3495603c1389fb838f0ac28a90bbfd5"
SRC_URI[sha256sum] = "80d28aee0a7cf9c2412f589e27638afab061a33740970935efeb990c31cea010"
S = "${WORKDIR}/image_common-release-release-crystal-image_transport-2.0.1-0"

inherit catkin
