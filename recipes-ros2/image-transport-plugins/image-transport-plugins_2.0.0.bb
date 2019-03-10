# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A set of plugins for publishing and subscribing to sensor_msgs/Image topics     in representations other than raw pixel data. For example, for viewing a     stream of images off-robot, a video codec will give much lower bandwidth     and latency. For low frame rate tranport of high-definition images, you     might prefer sending them as JPEG or PNG-compressed form."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake compressed-depth-image-transport compressed-image-transport theora-image-transport"
SRC_URI = "https://github.com/ros2-gbp/image_transport_plugins-release/archive/release/crystal/image_transport_plugins/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ba901819e08a72d29ce1c4008817fd84"
SRC_URI[sha256sum] = "31adddd619d0be5f1561ae22d965b98da156ee9b5f0bfa0d7f06534c7eb743cc"
S = "${WORKDIR}/image_transport_plugins-release-release-crystal-image_transport_plugins-2.0.0-0"

inherit catkin
